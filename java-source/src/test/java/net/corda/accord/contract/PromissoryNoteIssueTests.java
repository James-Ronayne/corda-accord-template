package net.corda.accord.contract;

import net.corda.core.contracts.*;
import net.corda.testing.node.MockServices;

import net.corda.core.transactions.LedgerTransaction;
import net.corda.accord.state.PromissoryNoteState;

import java.util.Arrays;

/**
 * TODO: Modify tests to adapt from IOU to promissory note.
 */
public class PromissoryNoteIssueTests {
    // A pre-defined dummy command.
    public interface Commands extends CommandData {
        class DummyCommand extends TypeOnlyCommandData implements Commands{}
    }

    static private final MockServices ledgerServices = new MockServices(Arrays.asList("net.corda.accord", "net.corda.finance"));


}
