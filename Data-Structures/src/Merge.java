/*package whatever //do not write package name here */

import java.io.*;

class Merge {
	public static void main (String[] args) {
		int a[] = {9,5,8,1,3};
		int len = a.length;
		mergeSort(a,0,len-1);
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
	public static void mergeSort(int [] a, int low, int high){
	    if(low<high){
	        int mid = (low + high)/2;  
	        mergeSort(a,low,mid);
	        mergeSort(a,mid+1,high);
	        merge(a,low,mid,high);
	    }
	}
	
	public static void merge(int [] a, int low, int mid, int high){
	    
	    int n1 = mid-low+1;
	    int n2 = high-mid;
	    int [] left = new int[n1];
	    int [] right = new int[n2];
	    for(int i=0;i<n1;i++){
	        left[i] = a[i+low];
	    }
	    for(int j=0;j<n2;j++){
	        right[j]=a[j+mid+1];
	    }
	    int i=0,j=0,k=low;
	    while(i<n1 && j<n2){
	     if(left[i]>right[j]){
	         a[k]=right[j];
	         j++;
	     }else{
	         a[k]=left[i];
	         i++;
	     }   
	     k++;
	    }
	    while(j<n2){
	        a[k]=right[j];
	        j++;
	        k++;
	    }
	    while(i<n1){
	        a[k]= left[i];
	        i++;
	        k++;
	    }
	    
	    
	}
}
