// Generated at Thu Nov 17 14:40:12 CET 2016 from platform:/resource/ar_drone/model/ar_drone.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'ar_drone'
//
// ======================================================================

module ar_drone_behaviour

open util/boolean
open OCCI
open ar_drone

//
// Imported extensions
//
open core

// ======================================================================
//
// OCCI kind 'http://occiware.org/ar_drone#ar_drone'
//
// ======================================================================

//
// Equivalence predicate between two Ar_drone atoms.
//
pred isoAr_drone[a1, a2: Ar_drone]
{
    // Comment following lines when this is not the expected behaviour.
    isoAr_drone[a1, a2] // same resource
}


//
// OCCI Action 'http://occiware.org/ar_drone/ar_drone/action#move'
//



//
// OCCI Action 'http://occiware.org/ar_drone/ar_drone/action#land'
//



//
// OCCI Action 'http://occiware.org/ar_drone/ar_drone/action#take_off'
//




// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

