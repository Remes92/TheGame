package entities.test;

import static org.junit.Assert.*;

import org.javatuples.Pair;
import org.junit.Test;

import entities.buildnings.Stockpile;
import entities.resources.*;

public class StockpileTest {

	@Test
	public void test() {
		Stockpile s = new Stockpile();
		Pair p = new Pair<Resources, Integer>(new Stone(), 3);
		s.setNeedResources(p);
		assertTrue(s.getNeedResources().size()>0);
	}

}
