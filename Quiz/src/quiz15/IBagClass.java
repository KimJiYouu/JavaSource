package quiz15;

public class IBagClass implements IBag {

	private String[] arr = new String[100];

	int index;

	@Override
	public void insert(String item) {
		arr[index] = item;
		index++;
	}

	@Override
	public void print() {

		System.out.print("현재목록: ");
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int search(String item) {

		for (int i = 0; i < index; i++) {
			if (arr[i].equals(item)) {

				System.out.print("찾는 값의 index: ");
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean delete(String item) {
		if (item == null) {
			return false;
		}

//		String[] newArr = new String[100];
		for (int i = 0; i < index; i++) {
			if (arr[i].equals(item)) {
				for (int j = i; j < index - 1; j++) {
					arr[j] = arr[j + 1];
				}
//				for (int k = 0; k < newArr.length; k++) {
//					newArr[k] = arr[k];
//				}
//				arr = newArr;
//				newArr = null;
				arr[index - 1] = null;
				index--;
				return true;
			}
		}
		return false;
	}
}
