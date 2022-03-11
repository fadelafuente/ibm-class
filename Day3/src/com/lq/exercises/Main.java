package com.lq.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.lq.c.Smoke;
import com.lq.c.a.Bicycle;
import com.lq.d.*;

public class Main {
	public static void main(String[] args) throws SpeedOutOfRangeException {
		/*
		Walk w = new Walk();
		// Airplane a = new Airplane();
		
		Smoke s = new Smoke();
		
		ICar c = new Car();
		
		com.lq.c.Car c2 = new com.lq.c.Car();
		
		Bicycle b = new Bicycle();
		
		HashSet<Car> h = new HashSet<Car>();
		h.add(new StationWagon());
		h.add(new SportsCar());
		
		Iterator<Car> iter = h.iterator();
		
		while(iter.hasNext()) {
			Car t = iter.next();
			System.out.println(t.getSpeed());
		}
		
		TreeSet<String> n = new TreeSet<String>();
		
		n.add("Zebra");
		n.add("Bear");
		n.add("apple");
		n.add("Elephant");
		
		Iterator<String> it = n.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<Car> cl = new ArrayList<Car>();
		cl.add(0, new StationWagon());
		cl.add(0, new SportsCar());
		
		for(Car r : cl) {
			System.out.println(r.getSpeed());
		}*/
		
		HashMap<String, Car> m = new HashMap<String, Car>();
		m.put("Sports", new SportsCar());
		m.put("StationWagon", new StationWagon());
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		m.forEach((k,v) -> System.out.println(k + " " + v.getSpeed()));
		
		try {
			SportsCar f = new SportsCar();
			f.setSpeed(3000);
		} catch(SpeedOutOfRangeException | SpeedWayOutOfRangeException e) {
			e.printStackTrace();
		}
	}

}
