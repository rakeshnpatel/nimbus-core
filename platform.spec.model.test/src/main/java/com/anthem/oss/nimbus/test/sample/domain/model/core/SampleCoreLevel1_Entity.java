/**
 * 
 */
package com.anthem.oss.nimbus.test.sample.domain.model.core;


import java.util.List;

import com.anthem.oss.nimbus.core.domain.definition.Model;
import com.anthem.oss.nimbus.core.domain.definition.extension.ActivateConditional;
import com.anthem.oss.nimbus.core.domain.definition.extension.Audit;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Soham Chakravarti
 *
 */
@Model
@Getter @Setter
public class SampleCoreLevel1_Entity {
	
	@Audit(SampleCoreAuditEntry.class)
	private String audit_nested_attr;
	
	private List<String> attr_list_String_noConversion;
	
	@ActivateConditional(when="state == 'Y'", targetPath="../level2")
	private String level1Attrib;
	
	private Level2 level2;

	@Model @Getter @Setter
	public static class Level2 {
	
		private String level2Attrib;
		
		private String[] string_array;
	}
	
}
