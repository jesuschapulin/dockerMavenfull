package org.siir.redalyc.model.entities.uredalyc.comparator;

import java.util.Comparator;

import org.siir.redalyc.model.entities.uredalyc.Tblrevtit;

public class TblrevtitComparator implements Comparator<Tblrevtit>{
	
	@Override
	public int compare(Tblrevtit o1, Tblrevtit o2) {
		return o1.getOrdrevtit().compareTo(o2.getOrdrevtit());
	}
	
}
