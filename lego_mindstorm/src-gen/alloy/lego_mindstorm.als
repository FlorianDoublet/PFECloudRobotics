// Generated at Thu Dec 15 14:28:16 CET 2016 from platform:/resource/lego_mindstorm/model/lego_mindstorm.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'lego_mindstorm'
//
// ======================================================================

module lego_mindstorm

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
// OCCI extension 'lego_mindstorm'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "lego_mindstorm"
    scheme = "http://occiware.org/lego_mindstorm#"
    import = core/extension
    kinds = lego_mindstom_ntx2 + robotgator
    no mixins
    no types
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/lego_mindstorm#lego_mindstom_ntx2'
//
// ======================================================================

one sig lego_mindstom_ntx2 extends Kind {} {
    term = "lego_mindstom_ntx2"
    scheme = "http://occiware.org/lego_mindstorm#"
    no title
    parent = core/resource
    attributes = lego_mindstom_ntx2_name + lego_mindstom_ntx2_angle + lego_mindstom_ntx2_move_speed + lego_mindstom_ntx2_mac_address + lego_mindstom_ntx2_duration
    actions = lego_mindstom_ntx2_move_forward + lego_mindstom_ntx2_move_backward + lego_mindstom_ntx2_rotate_right + lego_mindstom_ntx2_rotate_left + lego_mindstom_ntx2_stop_move
    entities in Lego_mindstom_ntx2
}

//
// OCCI attribute 'name'
//
one sig lego_mindstom_ntx2_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'angle'
//
one sig lego_mindstom_ntx2_angle extends Attribute {} {
    name = "angle"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'move_speed'
//
one sig lego_mindstom_ntx2_move_speed extends Attribute {} {
    name = "move_speed"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'mac_address'
//
one sig lego_mindstom_ntx2_mac_address extends Attribute {} {
    name = "mac_address"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'duration'
//
one sig lego_mindstom_ntx2_duration extends Attribute {} {
    name = "duration"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#move_forward'
//
one sig lego_mindstom_ntx2_move_forward extends Action {} {
    term = "move_forward"
    scheme = "http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#"
    title = "Move forward"
    no attributes
}


//
// OCCI action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#move_backward'
//
one sig lego_mindstom_ntx2_move_backward extends Action {} {
    term = "move_backward"
    scheme = "http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#"
    title = "Move backward"
    no attributes
}


//
// OCCI action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#rotate_right'
//
one sig lego_mindstom_ntx2_rotate_right extends Action {} {
    term = "rotate_right"
    scheme = "http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#"
    title = "Rotate right"
    no attributes
}


//
// OCCI action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#rotate_left'
//
one sig lego_mindstom_ntx2_rotate_left extends Action {} {
    term = "rotate_left"
    scheme = "http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#"
    title = "Rotate left"
    no attributes
}


//
// OCCI action 'http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#stop_move'
//
one sig lego_mindstom_ntx2_stop_move extends Action {} {
    term = "stop_move"
    scheme = "http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#"
    title = "Stop move"
    no attributes
}


// ======================================================================
// Signature for Lego_mindstom_ntx2
// ======================================================================

sig Lego_mindstom_ntx2 extends core/Resource {
    name : one String,
    angle : lone core/Number,
    move_speed : lone core/Number,
    mac_address : one String,
    duration : lone core/Number,
} {
    hasKind[lego_mindstom_ntx2]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/lego_mindstorm#robotgator'
//
// ======================================================================

one sig robotgator extends Kind {} {
    term = "robotgator"
    scheme = "http://occiware.org/lego_mindstorm#"
    no title
    parent = lego_mindstom_ntx2
    attributes = robotgator_ultra_sound_value
    actions = robotgator_open_mouth + robotgator_close_mouth + robotgator_read_ultra_sound
    entities in Robotgator
}

//
// OCCI attribute 'ultra_sound_value'
//
one sig robotgator_ultra_sound_value extends Attribute {} {
    name = "ultra_sound_value"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/lego_mindstorm/robotgator/action#open_mouth'
//
one sig robotgator_open_mouth extends Action {} {
    term = "open_mouth"
    scheme = "http://occiware.org/lego_mindstorm/robotgator/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/lego_mindstorm/robotgator/action#close_mouth'
//
one sig robotgator_close_mouth extends Action {} {
    term = "close_mouth"
    scheme = "http://occiware.org/lego_mindstorm/robotgator/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/lego_mindstorm/robotgator/action#read_ultra_sound'
//
one sig robotgator_read_ultra_sound extends Action {} {
    term = "read_ultra_sound"
    scheme = "http://occiware.org/lego_mindstorm/robotgator/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Robotgator
// ======================================================================

sig Robotgator extends Lego_mindstom_ntx2 {
    ultra_sound_value : lone core/Number,
} {
    hasKind[robotgator]
}

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

