package org.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MainPanel extends Composite {

	private static MainPanelUiBinder uiBinder = GWT.create(MainPanelUiBinder.class);

	interface MainPanelUiBinder extends UiBinder<Widget, MainPanel> {
	}

	public MainPanel() {
		
		initWidget(uiBinder.createAndBindUi(this));
				
		addAttachHandler(new AttachEvent.Handler() {			
			@Override
			public void onAttachOrDetach(AttachEvent event) {
				Window.alert(Document.get().getElementById("chart1")+""); //not null
			}
		}); 
	}
}
