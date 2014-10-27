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

* [Update Site URL @ INRIA](https://ci.inria.fr/k3al/job/kcvl/lastSuccessfulBuild/artifact/fr.inria.diverse.kcvl.p2updatesite/target/site/)
* [Continous Integration @ INRIA](https://ci.inria.fr/k3al/job/kcvl/)

### Quick Start
In this quick start, we use UML Designer to design the common base model of different product variants. We express variability abstraction, realization and configuration in a KCVL file and derive some products using the interpreter.

#### Base Model Design
First, we create a new UML project with a simple class diagram:

1. Open the Modeling perspective
2. File -> New -> UML Project (project name: QuickStart)
3. '+' sign left to model.uml -> Right-click '<Model> NewModel' -> New Representation -> NewModel Class Diagram
4. Design a class diagram using the graphical modeler
![UML Class Diagram](images/01.jpg)

#### KCVL file
KCVL file are expressed in a formalism as close as possible to the CVL formalism. The [CVL wiki](http://www.omgwiki.org/variability/doku.php) lists the different constructs available for expressing variability. KCVL files are composed of three main parts:

* A variability abstraction model (VAM) that expresses the feature model of the different variants
* A variability realization model (VRM) that specifies in which way the base model is affected by the selection of features
* A resolution model (RM) that allows to configure a feature model by selecting specific features corresponding to a given product

We create a new KCVL file in the QuickStart project (File -> New File -> QuickStart.kcvl).
![UML Class Diagram](images/02.jpg)


#### VAM
Below is an example feature model expressed in KCVL:

```
VP vam {
	Choice Blog { // Root feature
		implied // Blog is mandatory and automatically selected
		
		Choice Logging // Optional feature
		Choice Stylesheet { implied } // Mandatory feature

		Choice Database[1..1] { // XOR tree (one and only one feature of the subtree)
			Choice PostgreSQL
			Choice MySQL
		}
	}
	// OCL implication constraint: Logging mechanism requires a Database
	constraint implies(Logging, Database) on Blog
}
```

#### VRM
The following example illustrates the different variation points currently supported in KCVL. Any UML/Ecore/Capella/MOF-compliant model can be imported and supported with autocompletion.

```
VP vrm {
	import "model.uml"
	
	ObjectExistence V1 {
		object NewModel.ObjectExistenceTest
		choice C1
	}
	
	LinkExistence V2 {
		link NewModel.linkExistenceTestsToSlotAssignmentTests.bar
		choice C2
	}
	
	ObjectSubstitution V3 {
		placement NewModel.ObjectSubstitutionTest
		replacement NewModel.Test
		choice C3
	}
	
	LinkAssignment V4 {
		link NewModel.linkAssignmentTestsToSlotValueExistenceTests.bar
		linkEndIdentifier "ownedEnd"
		newEnd NewModel.linkAssignmentTestsToSlotValueExistenceTests.bar
		choice C4
	}
	
	SlotAssignment V5 {
		slotOwner NewModel.SlotAssignmentTest
		slotIdentifier "name"
		value "NewSlotAssignmentTestName"
		choice C5
	}
	
	SlotValueExistence V6 {
		slotOwner NewModel.SlotValueExistenceTest.propToUnset
		slotIdentifier "name"
		choice C6
	}
	
	PatternFusion V7 {
		bindings BindSubject1, BindWatcher1
		choice C7
	}
	
	RoleBinding BindSubject1 {
		role "/KcvlExamples/model.patterns#_2GQ-4F1REeSqzeBJjpaeLQ"
		target NewModel.PatternFusionTest
	}
	
	RoleBinding BindWatcher1 {
		role "/KcvlExamples/model.patterns#_3C6NUF1REeSqzeBJjpaeLQ"
		target NewModel.WatcherTest
	}
	
	PatternIntegration V8 {
		bindings BindSubject2, BindWatcher2
		choice C8
	}
	
	RoleBinding BindSubject2 {
		role "/KcvlExamples/model.patterns#_2GQ-4F1REeSqzeBJjpaeLQ"
		target NewModel.PatternIntegrationTest
	}
	
	RoleBinding BindWatcher2 {
		role "/KcvlExamples/model.patterns#_3C6NUF1REeSqzeBJjpaeLQ"
		target NewModel.WatcherTest
	}
}
```


### RM