import java.awt.*;
public class f2 extends Frame {
	MenuBar mb = new MenuBar();
	Menu file = new Menu("File");
	Menu edit = new Menu("edit");
	Menu format = new Menu("Format");

	MenuItem m1 = new MenuItem("new");
	MenuItem m2 = new MenuItem("open");
	MenuItem m3 = new MenuItem("Save");
	MenuItem m4 = new MenuItem("Save as");

	MenuItem e1 = new MenuItem("cut");
	MenuItem e2 = new MenuItem("copy");
	MenuItem e3 = new MenuItem("paste");

	MenuItem fr1 = new MenuItem("Font");
	MenuItem fr2 = new MenuItem("WordWrap");

	public f2() {
		setSize(400,400);
		setLayout(null);
		setMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		mb.add(format);

		file.add(m1);
		file.add(m2);
		file.add(m3);
		file.add(m4);

		edit.add(e1);
		edit.add(e2);
		edit.add(e3);

		format.add(fr1);
		format.add(fr2);

		setVisible(true);
	}
	public static void main(String[] args) {
		new f2();
	}
}