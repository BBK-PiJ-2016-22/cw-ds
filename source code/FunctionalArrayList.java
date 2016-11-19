/**
 * Functional array list based on ArrayList and implementing FunctionalList.
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {

    public ReturnObject head() {
        // returns copy of first element in list.
        ReturnObject objectToReturn = new ReturnObjectImpl(get(0).getReturnValue());

        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return objectToReturn;
        }
    }

    public FunctionalList rest() {
        // copies all elements, except first element to new list.
        FunctionalList listToReturn = new FunctionalArrayList();

            for (int i = 0; i < size(); i++) {

                if (i != 0) {
                    listToReturn.add(get(i).getReturnValue());
                }
            }
        return listToReturn;
    }
}
