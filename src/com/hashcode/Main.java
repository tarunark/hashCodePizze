package com.hashcode;

import java.util.ArrayList;

import com.hashcode.Solver.Slice;

public class Main
{
    
    public static void main(String[] args) throws Exception
    {
        Reader reader = new Reader(args[0]);
        reader.print();
        
        Solver solver = new Solver(reader);
        
        double bestCoverage = 0;
        ArrayList<Slice> slices = null;
        
        for(int i=0;i<100;i++)
        {
            double coverage = solver.solve();
            
            if(bestCoverage<coverage)
            {
                bestCoverage = coverage;
                slices = solver.slices;
            }
        }
        
        
        System.out.println("BestScore: " + bestCoverage);
        
        Writer writer = new Writer(args[0], slices, bestCoverage);
        
        
    }
    
}
