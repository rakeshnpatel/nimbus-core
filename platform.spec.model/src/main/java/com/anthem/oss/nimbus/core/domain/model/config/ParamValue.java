/**
 * 
 */
package com.anthem.oss.nimbus.core.domain.model.config;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Soham Chakravarti
 *
 */
@Data
public class ParamValue implements Serializable {
	
	private static final long serialVersionUID = 1L;

	final private Object code;
	
	private String label;
	
	private String desc;
	
	private boolean isActive = true;
	
	
	public ParamValue(Object code) {
		this(code, null, null);
	}
	
	public ParamValue(Object code, String label) {
		this(code, label, null);
	}

	public ParamValue(Object code, String label, String desc) {
		this.code = code;
		setLabel(label);
		setDesc(desc);
	}
}
