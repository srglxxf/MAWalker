package walker;

public class Version {
	private static String major = "0";
	private static String minor = "4";
	private static String release = "27";
	private static String copyright = "2013©wjsjwr.org";
	private static String code = "Waive";
	private static String thanks = "@innocentius, @AsakuraFuuko";
	
	public static String strVersion() {
		return String.format("MAWalker(java) v%s.%s.%s %s, %s", major, minor, release, code, copyright); 
	}
	
	public static String strThanks(){
		return String.format("对下列网友表示感谢（排名不分先后）: %s", thanks);
	}
	
}
