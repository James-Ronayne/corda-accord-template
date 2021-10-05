package net.corda.accord.contract

import net.corda.core.contracts.TypeOnlyCommandData
import net.corda.testing.node.MockServices


class PromissoryNoteIssueTests {
    // A pre-defined dummy command.
    class DummyCommand : TypeOnlyCommandData()
    private var ledgerServices = MockServices(listOf("net.corda.accord"))


}
