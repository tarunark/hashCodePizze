package com.hashcode;

import java.io.File;
import java.io.FileOutputStream;

import com.hashcode.Solver.Slice;

public class Writer
{

    public Writer(String fileName, Solver solver) throws Exception
    {
        File file = new File(fileName.substring(0, fileName.length()-3) + ".out");
        FileOutputStream fos =new FileOutputStream(file);
        
        
        String str = "" + solver.slices.size();
        
        fos.write(str.getBytes());
        fos.write("\n".getBytes());
        
        for(Slice slice:solver.slices)
        {
            fos.write(slice.toString().getBytes());
            fos.write("\n".getBytes());
        }

        fos.close();
    }
    
}
