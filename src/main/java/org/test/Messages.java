package org.test;

import com.google.gwt.core.shared.GWT;

public interface Messages extends BaseInterface<String>,  com.google.gwt.i18n.client.Messages{

	static Messages INSTANCE =  GWT.create(Messages.class);
	
	public static Messages getINSTANCE() {
		return INSTANCE;
	}
}
