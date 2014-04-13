package less.lesson11;

public class SimpleNotepad implements INotepad {
	private Page[] pages;
	
	public SimpleNotepad(int size) {
		pages = new Page[size];
		for(int i=0; i<pages.length; i++) {
			pages[i] = new Page("Title #" + (i + 1));
		}
	}
	
	@Override
	public void addText(String text, int page) {
		page--;
		if(isPageValid(page)) {
			pages[page].appendText(text);
		}
		
	}

	@Override
	public void replaceText(String text, int page) {
		page--;
		if(isPageValid(page)) {
			pages[page].deleteText();
			pages[page].appendText(text);
		}
	}

	@Override
	public void deleteText(int page) {
		page--;
		if(isPageValid(page)) {
			pages[page].deleteText();
		}
	}

	@Override
	public void printAllPages() {
		for(Page page : pages) {
			System.out.println(page.pagePreview());
		}
		
	}
	
	private boolean isPageValid(int page) {
		if(page >= 0 && page < pages.length) {
			return true;
		}
		
		System.out.println("Invalid page!");
		return false;
	}

	@Override
	public void searchWord(String word) {
	
	}

	@Override
	public void printAllPagesWithDigits() {
		
	}

}
