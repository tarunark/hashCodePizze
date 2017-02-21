package com.hashcode;

public class Main
{
    
    public static void main(String[] args) throws Exception
    {
        Reader reader = new Reader(args[0]);
        reader.print();
        
        Solver solver = new Solver(reader);
        
        solver.solve();
        
        Writer writer = new Writer(args[0], solver);
        
        
    }
    
}
