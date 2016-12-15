// Generated at Thu Dec 15 14:28:16 CET 2016 from platform:/resource/lego_mindstorm/model/lego_mindstorm.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'lego_mindstorm'
//
// ======================================================================

module lego_mindstorm_behaviour

open util/boolean
open OCCI
open lego_mindstorm

//
// Imported extensions
//
open core

// ======================================================================
//
// OCCI kind 'http://occiware.org/lego_mindstorm#lego_mindstom_ntx2'
//
// ======================================================================

//
// Equivalence predicate between two Lego_mindstom_ntx2 atoms.
//
pred isoLego_mindstom_ntx2[l1, l2: Lego_mindstom_ntx2]
{
    // Comment following lines when this is not the expected behaviour.
    isoLego_mindstom_ntx2[l1, l2] // same resource
}


//
// OCCI Action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#move_forward'
//



//
// OCCI Action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#move_backward'
//



//
// OCCI Action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#rotate_right'
//



//
// OCCI Action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#rotate_left'
//



//
// OCCI Action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#stop_move'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/lego_mindstorm#robotgator'
//
// ======================================================================

//
// Equivalence predicate between two Robotgator atoms.
//
pred isoRobotgator[r1, r2: Robotgator]
{
    // Comment following lines when this is not the expected behaviour.
    isoRobotgator[r1, r2] // same lego_mindstom_ntx2
}


//
// OCCI Action 'http://occiware.org/lego_mindstorm/robotgator/action#open_mouth'
//



//
// OCCI Action 'http://occiware.org/lego_mindstorm/robotgator/action#close_mouth'
//



//
// OCCI Action 'http://occiware.org/lego_mindstorm/robotgator/action#read_ultra_sound'
//




// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

