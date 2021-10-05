package net.corda.accord.contract;

import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.TypeOnlyCommandData;
import net.corda.testing.node.MockServices;

import java.util.Arrays;

/**
 * TODO: Modify tests to adapt from IOU to promissory note.
 */

public class PromissoryNoteTransferTests {

    public interface Commands extends CommandData {
        class DummyCommand extends TypeOnlyCommandData implements Commands{}
    }

    static private final MockServices ledgerServices = new MockServices(Arrays.asList("net.corda.accord"));

}
