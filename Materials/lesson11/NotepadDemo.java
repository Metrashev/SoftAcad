package less.lesson11;

public class NotepadDemo {
	public static void main(String[] args) {
		INotepad notepad = new SecuredNotepad(10);
		notepad.printAllPages();
		
		notepad.addText("str 1", 1);
		notepad.addText("smt smt stm smt smt", 10);
		notepad.addText("smt smt stm smt smt", 11);
		System.out.println();
		System.out.println();
		notepad.printAllPages();
//		notepad.replaceText("w456yertewg", 3);
//		notepad.replaceText("123", 3);
//		notepad.addText("abc", 3);
//		notepad.deleteText(10);
//		notepad.deleteText(3);
//		notepad.printAllPages();
	}
}
