package de.mpg.mpi.uima.engines.salie.pagerank.edges.structure

object GraphStructureFactory {

  def apply(graphStructure: String) : GraphStructureCreation = graphStructure match {
    case "clique" => new CliqueCreation
    case _ => throw new IllegalArgumentException("A graph with structure %s can not be created.".format(graphStructure))
  }

}
