package net.corda.accord;

import net.corda.accord.state.PromissoryNoteState;
import net.corda.core.node.ServiceHub;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

public class BraidService {

    ServiceHub serviceHub;

    BraidService(ServiceHub serviceHub) {
        this.serviceHub = serviceHub;
    }

    public String getOwner() {
        return this.serviceHub.getMyInfo().getLegalIdentities().get(0).getName().toString();
    }

    public String getIssuedPromissoryNotes() {
        JsonArrayBuilder allStatesJSONArrayBuilder = Json.createArrayBuilder();

        serviceHub.getVaultService().queryBy(PromissoryNoteState.class).getStates().forEach(stateAndRef -> {
            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
            objectBuilder.add("ContractText", stateAndRef.getState().getData().getApContractText());
            objectBuilder.add("MakerCordaParty", stateAndRef.getState().getData().getMakerCordaParty().getName().toString());
            objectBuilder.add("LenderCordaParty", stateAndRef.getState().getData().getLenderCordaParty().getName().toString());
            objectBuilder.add("AmountQuantity", ((double) stateAndRef.getState().getData().getAmount().getQuantity()) / 100.00);
            objectBuilder.add("AmountToken", stateAndRef.getState().getData().getAmount().getToken().toString());
            objectBuilder.add("LinearId", stateAndRef.getState().getData().getLinearId().toString());
            objectBuilder.add("IssuedOn", stateAndRef.getState().getData().getApContract().getDate().toString());
            objectBuilder.add("MaturityDate", stateAndRef.getState().getData().getApContract().getMaturityDate().toString());
            objectBuilder.add("InterestRate", stateAndRef.getState().getData().getApContract().getInterestRate());
            allStatesJSONArrayBuilder.add(objectBuilder.build().toString());
        });

        return allStatesJSONArrayBuilder.build().toString();
    }
}
