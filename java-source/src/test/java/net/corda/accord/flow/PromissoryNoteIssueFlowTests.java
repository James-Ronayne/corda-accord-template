package net.corda.accord.flow;

import net.corda.accord.contract.PromissoryNoteCordaContract;
import net.corda.accord.state.PromissoryNoteState;
import net.corda.core.contracts.Command;
import net.corda.core.identity.CordaX500Name;
import net.corda.core.transactions.SignedTransaction;
import net.corda.testing.node.*;
import net.corda.core.identity.Party;
import java.util.stream.Collectors;
import java.util.concurrent.Future;
import java.util.*;

import org.accordproject.money.CurrencyCode;
import org.accordproject.money.MonetaryAmount;
import org.accordproject.promissorynote.PromissoryNoteContract;
import org.accordproject.usa.business.BusinessEntity;
import org.h2.util.HashBase;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static net.corda.accord.TestUtils.*;

/**
 * The test executed below will parse the source contract data and create a corresponding Corda state representing a promissory note.
 */
public class PromissoryNoteIssueFlowTests {
    // TODO fix braid service instantiation so braid doesn't start if node config parameter isn't available
//    private MockNetwork mockNetwork;
//    private StartedMockNode a, b, c, d;
//
//
//    @Before
//    public void setup() {
//        MockNetworkParameters mockNetworkParameters = new MockNetworkParameters(Arrays.asList(TestCordapp.findCordapp("net.corda.accord").withConfig()))
//                .withNotarySpecs(Arrays.asList(new MockNetworkNotarySpec(new CordaX500Name("Notary", "London", "GB"))));
//        mockNetwork = new MockNetwork(mockNetworkParameters);
//
//        a = mockNetwork.createNode(DANIEL.getName());
//        b = mockNetwork.createNode(CLAUSE.getName());
//
//        ArrayList<StartedMockNode> startedNodes = new ArrayList<>();
//        startedNodes.add(a);
//        startedNodes.add(b);
//
//        // For real nodes this happens automatically, but we have to manually register the flow for tests
//        startedNodes.forEach(el -> el.registerInitiatedFlow(PromissoryNoteIssueFlow.ResponderFlow.class));
//        mockNetwork.runNetwork();
//
//    }
//
//    @After
//    public void tearDown() {
//        mockNetwork.stopNodes();
//    }
//
//    @Rule
//    public final ExpectedException exception = ExpectedException.none();
//
//    @Test
//    public void flowReturnsCorrectlyFormedPartiallySignedTransaction() throws Exception {
//
//        // TODO: Write a wrapper class for Lambda function
//        PromissoryNoteIssueFlow.InitiatorFlow flow = new PromissoryNoteIssueFlow.InitiatorFlow();
//
//        Future<SignedTransaction> future = a.startFlow(flow);
//        mockNetwork.runNetwork();
//
//        // Return the unsigned(!) SignedTransaction object from the PromissoryNoteIssueFlow.
//        SignedTransaction ptx = future.get();
//
//        // Print the transaction for debugging purposes.
//        System.out.println(ptx.getTx());
//
//        // Check the transaction is well formed...
//        // No outputs, one input PromissoryNoteState and a command with the right properties.
//        assert (ptx.getTx().getInputs().isEmpty());
//
//        PromissoryNoteState outputState = (PromissoryNoteState) ptx.getTx().getOutputs().get(0).getData();
//        assert (ptx.getTx().getOutputs().get(0).getData() instanceof PromissoryNoteState);
//
//        Command command = ptx.getTx().getCommands().get(0);
//        assert (command.getValue() instanceof PromissoryNoteCordaContract.Commands.Issue);
//        assert (new HashSet<>(command.getSigners()).equals(
//                new HashSet<>(outputState.getParticipants()
//                        .stream().map(el -> el.getOwningKey())
//                        .collect(Collectors.toList()))));
//
//        ptx.verifySignaturesExcept(outputState.lenderCordaParty.getOwningKey(),
//                mockNetwork.getDefaultNotaryNode().getInfo().getLegalIdentitiesAndCerts().get(0).getOwningKey());
//    }
//
//
//    private PromissoryNoteContract getTestPromissoryNoteContract(Party lender, Party borrower) {
//        PromissoryNoteContract promissoryNoteContract = new PromissoryNoteContract();
//        MonetaryAmount amount = new MonetaryAmount();
//        amount.setDoubleValue(10.0);
//        amount.setCurrencyCode(CurrencyCode.GBP);
//
//        promissoryNoteContract.setAmount(amount);
//        promissoryNoteContract.setDate(new Date());
//        promissoryNoteContract.setMaker(borrower.getName().toString());
//        promissoryNoteContract.setInterestRate(0.5);
//        promissoryNoteContract.setIndividual(true);
//        promissoryNoteContract.setMakerAddress("555 Fake British Avenue");
//        promissoryNoteContract.setLender(lender.getName().toString());
//        promissoryNoteContract.setLegalEntity(BusinessEntity.CORP);
//        promissoryNoteContract.setLenderAddress("666 Fake British Road");
//        promissoryNoteContract.setMaturityDate(new Date(1595065298));
//        promissoryNoteContract.setDefaultDays(30);
//        promissoryNoteContract.setInsolvencyDays(90);
//        promissoryNoteContract.setJurisdiction("Great Britain");
//        return promissoryNoteContract;
//    }
}
