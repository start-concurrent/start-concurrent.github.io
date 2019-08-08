import javax.swing.JFileChooser; //<.>
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileChooserExample {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();  //<.>
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png");
		chooser.setFileFilter(filter); //<.>
		
		int result = chooser.showOpenDialog(null);  //<.>
		if(result == JFileChooser.APPROVE_OPTION) { //<.>
			File file = chooser.getSelectedFile();
			if(file != null && file.exists()) {		//<.>
				long size = file.length();
				System.out.println("The file contains " + size + " bytes.");
			}
			else
				System.out.println("The file doesn't exist.");
		}
		else
			System.out.println("The user probably canceled.");
	}
}