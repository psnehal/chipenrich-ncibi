package org.ncibi.ws.resource;

import java.util.ResourceBundle;

import org.ncibi.chipenrich.ChipEnrichInputArguments;
import org.ncibi.commons.lang.ArrayUtil;


public abstract class AbstractSimpleChipEnrichResponseServerResource<V> extends AbstractSimpleResponseServerResource<V, ChipEnrichInputArguments>
{

	
	protected ChipEnrichInputArguments getArgumentsToResource()
	{
		//ResourceBundle url = ResourceBundle.getBundle("org.ncibi.resource.bundle.url");
		//String path = url.getString("uploadDirectory");
		
		//System.out.println("combine dateto resorces at AbstractSimpleChipEnrichResponseServerResource ");
		ChipEnrichInputArguments data = new ChipEnrichInputArguments();
		data.setUploadFile(getArgumentWithDefault("uploadfile", ""));
		data.setUploadMappaFile(getArgumentWithDefault("uploadMappafile", ""));
		data.setOutPath(getArgumentWithDefault("outpath","/usr/share/chipFileStore/" ));
		data.setOutName(getArgumentWithDefault("outname", "chipenrich"));
		data.setEmail(getArgumentWithDefault("email", "snehal@med.umich.edu"));
		data.setSgList(getArgumentWithDefault("sglist","human"));
		data.setSgSetList(ArrayUtil.toStringArray(getArgumentWithDefault("slist","")));
		data.setMethod(getArgumentWithDefault("method","chipenrich"));
		data.setLd(getArgumentWithDefault("ld","nearest_tss"));
		data.setIsMappable(getArgumentWithDefault("ismappable","F"));
		data.setRc(getArgumentWithDefault("rc","24"));
		data.setQc(getArgumentWithDefault("qc","T"));
		data.setFilter(getArgumentWithDefault("filter","2000"));
		data.setPeakThr(getArgumentWithDefault("peakthr","1"));
		return data;
		
	}
	
	
}
