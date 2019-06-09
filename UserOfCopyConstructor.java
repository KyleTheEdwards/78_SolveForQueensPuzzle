/**
  test copy constructor for BoardForQueensPuzzle
 */

public class UserOfCopyConstructor {
    public static void main(String[] commandLine) {
        System.out.println();

        System.out.println(
            "Code in the skeleton for BoardForQueensPuzzle was tested "
          + "in the previous homework." + "\t"
          + "Code below here tests the copy constructor in "
          + "BoardForQueensPuzzle." + "\t"
          );

        // Create the board that will be changed
        BoardForQueensPuzzle changeMe = new BoardForQueensPuzzle( 3);
        changeMe.populate(2);
        System.out.println( "Before change, the original is..."
                          + "\t"
                          + changeMe
                          );

        // copy-construct another board
        BoardForQueensPuzzle snapshot = new BoardForQueensPuzzle( changeMe);
        System.out.println( "...and the snapshot is..."
                          + "\t"
                          + snapshot
                          );

        // change the original
        changeMe.populate(0);

        System.out.println( "after change, the original is..."
                          + "\t"
                          + changeMe + "\t"
                          + "...and the snapshot is..."
                          + "\t"
                          + snapshot
                          );
    }
}
