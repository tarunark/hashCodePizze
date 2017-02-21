package com.hashcode;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.hashcode.Solver.Slice;

public class Writer
{

    public Writer(String fileName, ArrayList<Slice> slices, double bestCoverage) throws Exception
    {
        File file = new File(fileName.substring(0, fileName.length()-3) + "_" + bestCoverage + "_"+ ".out");
        FileOutputStream fos =new FileOutputStream(file);
        
        
        String str = "" + slices.size();
        
        fos.write(str.getBytes());
        fos.write("\n".getBytes());
        
        for(Slice slice:slices)
        {
            fos.write(slice.toString().getBytes());
            fos.write("\n".getBytes());
        }

        fos.close();
    }
    
}
