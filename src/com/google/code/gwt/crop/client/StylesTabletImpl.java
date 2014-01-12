package com.google.code.gwt.crop.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

/**
 * Implementation of the style bundle initializer for tablets
 * 
 * @author ilja
 *
 */
class StylesTabletImpl implements ICropperStyleSource {

	private final IStyleTablet bundleResources = GWT.create(IStyleTablet.class);

	interface IStyleTablet extends ClientBundle {
		
		@Source("GWTCropperTablet.css")
		CropperStyleResource getStyles();
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public CropperStyleResource css() {
		return bundleResources.getStyles();
	}
}