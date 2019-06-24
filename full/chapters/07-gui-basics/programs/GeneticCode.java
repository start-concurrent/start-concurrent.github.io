/*
 * Created on March 20, 2009
 * @author Aditya Mathur
 *
 * This class contains the Standard Genetic Code. We use it to convert a DNA sequence to a Protein sequence.
 */

public class GeneticCode {
 
 private static final String [] tCodon={"TTT", "TTC", "TTA", "TTG",  "CTT", "CTC", "CTA", "CTG", "ATT", "ATC", "ATA", "ATG",   "GTT", "GTC", "GTA", "GTG"};
 private static final String [] cCodon={"TCT", "TCC", "TCA", "TCG",  "CCT", "CCC", "CCA", "CCG", "ACT", "ACC", "ACA", "ACG",   "GCT", "GCC", "GCA", "GCG"};
 private static final String [] aCodon={"TAT", "TAC", "TAA", "TAG",  "CAT", "CAC", "CAA", "CAG",  "AAT", "AAC", "AAA", "AAG",   "GAT", "GAC", "GAA", "GAG"};
 private static final String [] gCodon={"TGT", "TGC", "TGA", "TGG",  "CGT", "CGC", "CGA", "CGG", "AGT", "AGC", "AGA", "AGG",   "GGT", "GGC", "GGA", "GGG"};
 
 
 private static int index=-1; // Used during search for an Amino acid given a codon.
 
 public static char codonToAmino(String codon){
  
  // Find the Amino acid corresponding to codon. Recall that a STOP
  // is indicated by a ? character.
  
  if(search(codon, tCodon)) return(tAmino[index]);
  if(search(codon, cCodon)) return(cAmino[index]);
  if(search(codon, aCodon)) return(aAmino[index]);
  if(search(codon, gCodon)) return(gAmino[index]);
  return(' '); // Return space character if codon not found.
 }
 
 
 // Search for a givenCodon in an array of Codons.
 
 private static boolean search(String givenCodon, String [] codons){
  
  index=0; // Index to the first element of the codons array.
  boolean codonFound=false;
  
  while(index<codons.length && !codonFound){
   if(givenCodon.equals(codons[index]))
    codonFound=true;
   else
    index++;
  }
  return(codonFound);
   
  }
  
 }
