package pl.retsuz.shell.variations.diff;

import pl.retsuz.filesystem.TextFile;
import pl.retsuz.shell.gen.ICommand;
import pl.retsuz.shell.variations.gen.CommandVariation;
import pl.retsuz.shell.variations.gen.ICommandVariation;

public class DIFF_def extends CommandVariation{
    public DIFF_def(ICommandVariation next, ICommand parent){
        super(next,parent,"");
    }

    @Override
    public void make(String params){
        System.out.println("Zbyt mała liczba parametrów!");
    }
}
