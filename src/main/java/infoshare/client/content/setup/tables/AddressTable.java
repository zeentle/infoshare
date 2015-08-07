package infoshare.client.content.setup.tables;

import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.server.Responsive;
import com.vaadin.ui.Table;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.themes.ValoTheme;
import infoshare.domain.Address;
import infoshare.services.Address.AddressService;
import infoshare.services.Address.Impl.AddressServiceImpl;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created by codex on 2015/07/30.
 */
public class AddressTable extends TreeTable {
    private AddressService service = new AddressServiceImpl();

    public AddressTable() {
        setSizeFull();

       // HierarchicalContainer
        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }

}
