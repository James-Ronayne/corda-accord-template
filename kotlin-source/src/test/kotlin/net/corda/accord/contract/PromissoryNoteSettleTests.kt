package net.corda.accord.contract

import net.corda.core.contracts.TypeOnlyCommandData
import net.corda.testing.node.MockServices


class PromissoryNoteSettleTests {
    // A pre-defined dummy command.
    class DummyCommand : TypeOnlyCommandData()
    var ledgerServices = MockServices(listOf("net.corda.accord"))

}

