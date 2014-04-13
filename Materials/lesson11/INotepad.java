package less.lesson11;

public interface INotepad {
	void addText(String text, int page);
	void replaceText(String text, int page);
	void deleteText(int page);
	void printAllPages();
	void searchWord(String word);
	void printAllPagesWithDigits();
}
