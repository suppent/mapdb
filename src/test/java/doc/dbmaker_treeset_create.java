package doc;

import org.mapdb.*;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.NavigableSet;


public class dbmaker_treeset_create {

    public static void main(String[] args) {
        DB db = DBMaker
                .memoryDB()
                .make();
        //a
        NavigableSet<String> treeSet = db
                .treeSetCreate("treeSet")
                .nodeSize(112)
                .serializer(BTreeKeySerializer.STRING)
                .makeOrGet();
        //z
    }
}
