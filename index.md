---
layout: index
---

### KCVL
KCVL is a *prototype* implementation of the OMG [Common Variability Language](http://www.omgwiki.org/variability/doku.php) with several additional features. KCVL comes with a textual editor for expressing variability abstraction models, variability realization models and resolution models. Several services are built around this textual representation, including:

* The manipulation of base architecture models expressed in different formalisms such as [UML](http://marketplace.obeonetwork.com/module/uml), [EMF Ecore](http://www.eclipse.org/modeling/emf/) or [Capella](https://www.polarsys.org/proposals/capella). Any MOF-compliant language can be integrated with little effort.
* An interpreter for deriving specific products architectures from a common base model
* A binding to [FAMILIAR](http://familiar-project.github.io/) for manipulating and reasoning about (multiple) feature models
* New variability realization concepts leveraging [EMF Diff/Merge](http://eclipse.org/diffmerge/) patterns mechanism

### Installation
KCVL is bundled as a set of Eclipse plugins.

#### Requirements

* Eclipse Juno (3.8/4.2)
* Xtext 2.3.1
* EMF Diff/Merge (including patterns tool)
* Sirius
* Groovy-Eclipse

#### Installation
_Help -> Install New Software..._

* [Update Site @ INRIA](https://ci.inria.fr/k3al/job/kcvl/lastSuccessfulBuild/artifact/fr.inria.diverse.kcvl.p2updatesite/target/site/)
* [Continous Integration @ INRIA](https://ci.inria.fr/k3al/job/kcvl/)

### Quick Start

Modifications here :)
