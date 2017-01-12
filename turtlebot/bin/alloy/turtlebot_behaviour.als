// Generated at Thu Jan 12 14:53:32 CET 2017 from platform:/resource/turtlebot/model/turtlebot.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'turtlebot'
//
// ======================================================================

module turtlebot_behaviour

open util/boolean
open OCCI
open turtlebot

//
// Imported extensions
//
open core

// ======================================================================
//
// OCCI kind 'http://occiware.org/turtlebot#turtlebot'
//
// ======================================================================

//
// Equivalence predicate between two Turtlebot atoms.
//
pred isoTurtlebot[t1, t2: Turtlebot]
{
    // Comment following lines when this is not the expected behaviour.
    isoTurtlebot[t1, t2] // same resource
}


//
// OCCI Action 'http://occiware.org/turtlebot/turtlebot/action#move_forward'
//



//
// OCCI Action 'http://occiware.org/turtlebot/turtlebot/action#move_backward'
//



//
// OCCI Action 'http://occiware.org/turtlebot/turtlebot/action#turn_left'
//



//
// OCCI Action 'http://occiware.org/turtlebot/turtlebot/action#turn_right'
//



//
// OCCI Action 'http://occiware.org/turtlebot/turtlebot/action#stop'
//




// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

