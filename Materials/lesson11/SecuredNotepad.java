package less.lesson11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private String password;
	private static final Scanner scanner = new Scanner(System.in);

	public SecuredNotepad(int size) {
		super(size);
		password = readPassword();
	}

	@Override
	public void addText(String text, int page) {
		if (isValidPassword()) {
			super.addText(text, page);
		}
	}

	@Override
	public void replaceText(String text, int page) {
		if (isValidPassword()) {
			super.replaceText(text, page);
		}
	}

	@Override
	public void deleteText(int page) {
		if (isValidPassword()) {
			super.deleteText(page);
		}
	}

	@Override
	public void printAllPages() {
		if (isValidPassword()) {
			super.printAllPages();
		}
	}

	private String readPassword() {
		System.out.print("Enter password: ");
		return scanner.nextLine();
	}

	private boolean isValidPassword() {
		String tmpPass = readPassword();
		for (int i = 0; i <= 2; i++) {
			if (password.equals(tmpPass)) {
				return true;
			} else {
				System.out.println("Wrong pass!");
				break;
			}
		}
		return false;

	}
}
