package less.lesson11;

public class Page {
	private String title;
	private String text;

	public Page(String title) {
		this.title = title;
	}

	public void appendText(String text) {
		if (this.text == null) {
			this.text = text;
		} else {
			this.text += text;
		}
	}

	public void deleteText() {
		text = null;
	}

	public String pagePreview() {
		String result = "==== PAGE ====\n" + "Title: " + title;
		if (text != null) {
			result += "\n" + text;
		}

		return result;
	}

	public void searchWord(String word) {
		if (word != null)
			if (word == this.text) {

			} else {
				System.out.println("Can't find word!");
			}
	}

	public void containsDigits() {
		
	}

}
