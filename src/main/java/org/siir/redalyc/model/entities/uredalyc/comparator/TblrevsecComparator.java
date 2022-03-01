package org.siir.redalyc.model.entities.uredalyc.comparator;

import java.util.Comparator;

import org.siir.redalyc.model.entities.uredalyc.Tblrevsec;

public class TblrevsecComparator implements Comparator<Tblrevsec>{

	@Override
	public int compare(Tblrevsec o1, Tblrevsec o2) {
		return o1.getOrdentsec().compareTo(o2.getOrdentsec());
	}

}
