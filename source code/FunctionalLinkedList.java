/**
 * Functional linked list based on LinkedList and implementing FunctionalList.
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    public ReturnObject head() {
        // returns copy of first element in list.
        ReturnObject objectToReturn = new ReturnObjectImpl(get(0).getReturnValue());

        if (size() == 0) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return objectToReturn;
        }
    }

    public FunctionalList rest() {
        // copies all elements, except first element to new list.
        FunctionalList listToReturn = new FunctionalLinkedList();

            for (int i = 0; i < size(); i++) {

                if (i != 0) {
                    listToReturn.add(get(i).getReturnValue());
                }
            }
        return listToReturn;
    }
}
