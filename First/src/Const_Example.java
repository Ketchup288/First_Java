public class Const_Example 
{
	public static final double CM_PER_INCH = 2.54; // final означає, що більше змініти її не можна буде, 
	// public означає, що використовувати її можна не тільки в main, а і у ще інших класах по ссилці Const_Example.CM_PER_INCH
	public static void main(String[] args)
	{
		double paperWidth = 8.5;
		double PaperHeight = 11;
		System.out.println("Paper size in centimeters: "
				+ paperWidth * CM_PER_INCH 
				+ " by " + PaperHeight * CM_PER_INCH);
	}
}

	