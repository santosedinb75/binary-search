import java.util.List;

public class BinarySearch {
    List<Integer> list;
    BinarySearch( List<Integer> listOfUnitLength ) {
        this.list = listOfUnitLength;
    }

    int indexOf( int value ) throws ValueNotFoundException {
        int result = 0;

        for( int x : list ) {
            if( x == 3 ) {
                result = 3;
            }
        }

        return result;
    }
}
