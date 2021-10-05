package net.corda.accord.flow;

import net.corda.testing.node.*;

import static net.corda.testing.node.NodeTestUtils.ledger;

/**
 * TODO: Write tests for promissory note settling once functionality is complete.
 */
public class PromissoryNoteSettleFlowTests {

    private MockNetwork mockNetwork;
    private StartedMockNode a, b, c;

//    @Before
//    public void setup() {
//
//        MockNetworkParameters mockNetworkParameters = new MockNetworkParameters().withNotarySpecs(Arrays.asList(new MockNetworkNotarySpec(new CordaX500Name("Notary", "London", "GB"))));
//        mockNetwork = new MockNetwork(Arrays.asList("net.corda.accord", "net.corda.finance.contracts.asset", "net.corda.finance.schemas"), mockNetworkParameters);
//        System.out.println(mockNetwork);
//
//        a = mockNetwork.createNode(new MockNodeParameters());
//        b = mockNetwork.createNode(new MockNodeParameters());
//        c = mockNetwork.createNode(new MockNodeParameters());
//
//        ArrayList<StartedMockNode> startedNodes = new ArrayList<>();
//        startedNodes.add(a);
//        startedNodes.add(b);
//        startedNodes.add(c);
//
//        // For real nodes this happens automatically, but we have to manually register the flow for tests
//        startedNodes.forEach(el -> el.registerInitiatedFlow(PromissoryNoteSettleFlow.Responder.class));
//        mockNetwork.runNetwork();
//    }
//
//    @After
//    public void tearDown() {
//        mockNetwork.stopNodes();
//    }
//
//    @Rule
//    public final ExpectedException exception = ExpectedException.none();

}