package net.corda.accord.flow

import net.corda.core.identity.CordaX500Name
import net.corda.testing.node.MockNetwork
import net.corda.testing.node.MockNetworkNotarySpec
import net.corda.testing.node.MockNodeParameters
import net.corda.testing.node.StartedMockNode
import org.junit.After
import org.junit.Before


class PromissoryNoteIssueFlowTests {

    // TODO fix braid service instantiation so braid doesn't start if node config parameter isn't available
//    lateinit var mockNetwork: MockNetwork
//    lateinit var a: StartedMockNode
//    lateinit var b: StartedMockNode
//
//    @Before
//    fun setup() {
//        mockNetwork = MockNetwork(listOf("net.corda.accord"),
//                notarySpecs = listOf(MockNetworkNotarySpec(CordaX500Name("Notary","London","GB"))))
//        a = mockNetwork.createNode(MockNodeParameters())
//        b = mockNetwork.createNode(MockNodeParameters())
//        val startedNodes = arrayListOf(a, b)
//        // For real nodes this happens automatically, but we have to manually register the flow for tests
//        startedNodes.forEach { it.registerInitiatedFlow(PromissoryNoteIssueResponderFlow::class.java) }
//        mockNetwork.runNetwork()
//    }
//
//    @After
//    fun tearDown() {
//        mockNetwork.stopNodes()
//    }

}
