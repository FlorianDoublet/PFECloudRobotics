// Generated at Thu Nov 17 14:40:12 CET 2016 from platform:/resource/ar_drone/model/ar_drone.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'ar_drone'
//
// ======================================================================

module ar_drone

open util/boolean
open OCCI

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core

// ======================================================================
//
// OCCI extension 'ar_drone'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "ar_drone"
    scheme = "http://occiware.org/ar_drone#"
    import = core/extension
    kinds = ar_drone
    no mixins
    no types
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/ar_drone#ar_drone'
//
// ======================================================================

one sig ar_drone extends Kind {} {
    term = "ar_drone"
    scheme = "http://occiware.org/ar_drone#"
    no title
    parent = core/resource
    attributes = ar_drone_name + ar_drone_left_right_tilt + ar_drone_front_back_tilt + ar_drone_vertical_speed + ar_drone_angular_speed
    actions = ar_drone_move + ar_drone_land + ar_drone_take_off
    entities in Ar_drone
}

//
// OCCI attribute 'name'
//
one sig ar_drone_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'left_right_tilt'
//
one sig ar_drone_left_right_tilt extends Attribute {} {
    name = "left_right_tilt"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "The left-right tilt (aka. "drone roll" or phi
         *            angle) argument is a percentage of the maximum inclination as
         *            configured here. A negative value makes the drone tilt to its
         *            left, thus flying leftward. A positive value makes the drone
         *            tilt to its right, thus flying rightward."
    multiple_values = False
}

         //
         // OCCI attribute 'front_back_tilt'
         //
         one sig ar_drone_front_back_tilt extends Attribute {} {
             name = "front_back_tilt"
             type = core/Number_DataType
             mutable = True
             required = True
             no default
             description = "The front-back tilt (aka. "drone pitch" or theta
                  *            angle) argument is a percentage of the maximum inclination as
                  *            configured here. A negative value makes the drone lower its
                  *            nose, thus flying frontward. A positive value makes the drone
                  *            raise its nose, thus flying backward. The drone translation
                  *            speed in the horizontal plane depends on the environment and
                  *            cannot be determined. With roll or pitch values set to 0, the
                  *            drone will stay horizontal but continue sliding in the air
                  *            because of its inertia. Only the air resistance will then make
                  *            it stop."
             multiple_values = False
         }

                  //
                  // OCCI attribute 'vertical_speed'
                  //
                  one sig ar_drone_vertical_speed extends Attribute {} {
                      name = "vertical_speed"
                      type = core/Number_DataType
                      mutable = True
                      required = True
                      no default
                      description = "The vertical speed (aka. "gaz") argument is a
                           *            percentage of the maximum vertical speed as defined here. A
                           *            positive value makes the drone rise in the air. A negative
                           *            value makes it go down."
                      multiple_values = False
                  }

                           //
                           // OCCI attribute 'angular_speed'
                           //
                           one sig ar_drone_angular_speed extends Attribute {} {
                               name = "angular_speed"
                               type = core/Number_DataType
                               mutable = True
                               required = True
                               no default
                               description = "The angular speed argument is a percentage of the
                                    *            maximum angular speed as defined here. A positive value makes
                                    *            the drone spin right; a negative value makes it spin left."
                               multiple_values = False
                           }

                                    //
                                    // OCCI action 'http://occiware.org/ar_drone/ar_drone/action#move'
                                    //
                                    one sig ar_drone_move extends Action {} {
                                        term = "move"
                                        scheme = "http://occiware.org/ar_drone/ar_drone/action#"
                                        title = "Move the drone"
                                        no attributes
                                    }
                                    

                                    //
                                    // OCCI action 'http://occiware.org/ar_drone/ar_drone/action#land'
                                    //
                                    one sig ar_drone_land extends Action {} {
                                        term = "land"
                                        scheme = "http://occiware.org/ar_drone/ar_drone/action#"
                                        title = "Land the drone"
                                        no attributes
                                    }
                                    

                                    //
                                    // OCCI action 'http://occiware.org/ar_drone/ar_drone/action#take_off'
                                    //
                                    one sig ar_drone_take_off extends Action {} {
                                        term = "take_off"
                                        scheme = "http://occiware.org/ar_drone/ar_drone/action#"
                                        title = "Take off the drone"
                                        no attributes
                                    }
                                    

// ======================================================================
// Signature for Ar_drone
// ======================================================================

sig Ar_drone extends core/Resource {
    name : lone String,
    left_right_tilt : one core/Number,
    front_back_tilt : one core/Number,
    vertical_speed : one core/Number,
    angular_speed : one core/Number,
} {
    hasKind[ar_drone]
}

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

