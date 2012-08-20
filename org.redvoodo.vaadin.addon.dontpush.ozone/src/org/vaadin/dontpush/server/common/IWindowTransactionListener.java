package org.vaadin.dontpush.server.common;

import com.vaadin.Application;
import com.vaadin.ui.Window;

public interface IWindowTransactionListener {
	void transactionStarts(Application application, Window window);
	void transactionEnds(Application application, Window window);
}
