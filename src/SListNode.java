//--------------------------------------------------------------------
//
//  Laboratory 7                                       SListNode.java
//
//  SOLUTION: Linked list implementation of the List ADT
//
//--------------------------------------------------------------------



class SListNode {


    // Data members
    private Object element;         // List element
    private SListNode next;         // Reference to the next element


    // Constructor
    SListNode(Object elem, SListNode nextPtr)
    // Creates a list node containing element elem and next pointer
    // nextPtr.
    {
        element = elem;
        next = nextPtr;
    }


    // Class Methods used by client class
    SListNode getNext()                    // Return reference to next element
    {
        return next;
    }


    SListNode setNext(SListNode nextVal)  // Set reference to next element
    {                                       //  & return that reference
        return (next = nextVal);
    }


    Object getElement()                    // Return the element in the current node
    {
        return element;
    }


    void setElement(Object newElem)         // Set current element to newElem 
    {
        element = newElem;
    }

} // class SListNode

