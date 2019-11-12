import java.util.Arrays;
public class CommandLine {
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
