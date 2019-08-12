import java.util.List;

class BinarySearch {
    private final List<Integer> list;

    BinarySearch( final List<Integer> passedList ) {
        this.list = passedList;
    }

    int indexOf( Integer target ) throws ValueNotFoundException {
        return indexOf( target, 0, list.size() - 1 );
    }

    private int indexOf( Integer target, int low, int high ) throws ValueNotFoundException {
        if ( low > high ) {
            throw new ValueNotFoundException( "Value not in array" );
        }
        int mid = ( low + high ) / 2;

        if ( target.compareTo( list.get( mid ) ) == 0 ) {
            return mid;
        } else if ( target.compareTo( list.get( mid ) ) < 0 ) {
            return indexOf( target, low, mid - 1 );
        } else {
            return indexOf( target, mid + 1, high );
        }
    }
}

//import java.util.List;
//
//public class BinarySearch {
//    private List<Integer> list;
//
//    BinarySearch( List<Integer> listOfUnitLength ) {
//        this.list = listOfUnitLength;
//    }
//
//    int indexOf( int desiredValue ) throws ValueNotFoundException {
//        int valueFoundAtIndex;
//
//        if ( list.contains( desiredValue ) ) {
//            valueFoundAtIndex = list.indexOf( desiredValue );
//        } else {
//            throw new ValueNotFoundException( "\"Value not in array" );
//        }
//
//        return valueFoundAtIndex;
//    }
//}