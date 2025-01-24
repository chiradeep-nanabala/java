//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Convert_Array_To_Streams atsObj = new Convert_Array_To_Streams();
        atsObj.convertPrimitiveTypeToStreams();
        System.out.println("\n");
        atsObj.convertObjectTypeToStream();

        TraditionalVsStreamExample tvsObj = new TraditionalVsStreamExample();
        tvsObj.sumOfEvenSquaresTraditional();
        tvsObj.sumOfEvenSquaresStream();

        MapVsFlatMap mvfmObj = new MapVsFlatMap();
        mvfmObj.usingMap();
        mvfmObj.usingFlatMap();
    }
}