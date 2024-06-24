package com.sunbeam;

public class PriorityQueue {
	private int qSize;
	private Heap h;
	public PriorityQueue(int size)
	{
		qSize=size;
		h = new Heap(qSize);
	}
	public void Push(int value)
	{
		h.addHeap(value);
	}
	public int Pop()
	{
		return h.deleteHeap();
	}
	public int Peek()
	{
		return h.getMax();
	}

}
